package ba.terawatt.etsmostar.APIsForFetchingData;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import ba.terawatt.etsmostar.UpdateVotedPoll;

/**
 * Created by Emir on 8.8.2017.
 */
public class FetchPollVotedAPI extends AsyncTask<String, Void, JSONObject> {

    private UpdateVotedPoll updateVotedPoll;
    public FetchPollVotedAPI(UpdateVotedPoll updateVotedPoll){
        this.updateVotedPoll = updateVotedPoll;
    }
    @Override
    protected JSONObject doInBackground(String... strings) {
        String _url = strings[0];
        try {
            URL url = new URL(_url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
            String line = "";
            StringBuilder response = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null)
                response.append(line + "\n");
            bufferedReader.close();
            httpURLConnection.disconnect();
            return new JSONObject(response.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        updateVotedPoll.beforeFetcingPoll();
    }

    @Override
    protected void onPostExecute(JSONObject jsonObject) {
        updateVotedPoll.afterUpdatingPoll();
        try {
            updateVotedPoll.UpdateVotedPollUI(jsonObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        super.onPostExecute(jsonObject);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
