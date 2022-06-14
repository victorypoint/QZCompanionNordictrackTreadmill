package org.cagnulein.qzcompanionnordictracktreadmill;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

public class QZJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        // use this to start and trigger a service
        Intent i= new Intent(getApplicationContext(), QZService.class);
        // potentially add data to the intent
        i.putExtra("KEY1", "Value to be used by the service");
        getApplicationContext().startService(i);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}
