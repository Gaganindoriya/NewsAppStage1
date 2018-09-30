package indoriya.gagan.com.newsappstage1;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;


public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static String REQUEST_URL =
            "http://content.guardianapis.com/search?show-tags=contributor&api-key=24e9a993-cc6e-4363-8b64-960851b55260";

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsData(REQUEST_URL);
        return newsList;
    }
}