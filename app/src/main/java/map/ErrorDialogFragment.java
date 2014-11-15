package map;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

/**
 * Created by liushi on 11/13/14.
 */
public class ErrorDialogFragment extends DialogFragment {
    private Dialog mDialog;

    public ErrorDialogFragment() {
        super();
        this.mDialog = null;
    }

    public void setDialog(Dialog mDialog) {
        this.mDialog = mDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return mDialog;
    }
}
