package net.dirbaio.cryptocat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BuddyInfoActivity extends Activity {
    public static final String EXTRA_TITLE = "BuddyInfoActivity.EXTRA_TITLE";
    public static final String EXTRA_MULTIPARTY_FINGERPRINT = "BuddyInfoActivity.EXTRA_MULTIPARTY_FINGERPRINT";
    public static final String EXTRA_OTR_FINGERPRINT = "BuddyInfoActivity.EXTRA_OTR_FINGERPRINT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(getIntent().getStringExtra(EXTRA_TITLE));

        setContentView(R.layout.dialog_buddy_info);

        TextView multipartyFingerprint = (TextView) findViewById(R.id.multipartyFingerprint);
        multipartyFingerprint.setText(getIntent().getStringExtra(EXTRA_MULTIPARTY_FINGERPRINT));

        TextView otrFingerprint = (TextView) findViewById(R.id.otrFingerprint);
        otrFingerprint.setText(getIntent().getStringExtra(EXTRA_OTR_FINGERPRINT));
    }
}
