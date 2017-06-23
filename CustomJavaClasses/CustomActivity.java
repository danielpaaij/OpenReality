package eu.kudan.kudansamples;

import com.unity3d.player.UnityPlayerActivity;
import com.unity3d.player.UnityPlayer;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.net.Uri;

public class CustomActivity extends UnityPlayerActivity {

    protected void onCreate(Bundle savedInstanceState) {

      // call UnityPlayerActivity.onCreate()
      super.onCreate(savedInstanceState);
	  
	  // get the uri scheme intent data (bylder://arview?id=x)
      Intent intent = getIntent();
	  
      if (Intent.ACTION_VIEW.equals(intent.getAction())) {

        Uri uri = intent.getData();
        String modelId = uri.getQueryParameter("id");
        if(modelId != "") {
          switch (modelId){
            case "4011097519876":
				UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
				break;
			case "4011097239071":
			    UnityPlayer.UnitySendMessage("Kudan Camera", "tapScene", "");
				break;
            case "4011097679129":
				UnityPlayer.UnitySendMessage("Kudan Camera", "focusScene", "");
				break;
            case "4011097718590":
				UnityPlayer.UnitySendMessage("Kudan Camera", "wastafelScene", "");
				break;
			case "4011097679594":
				UnityPlayer.UnitySendMessage("Kudan Camera", "showerScene", "");
				break;
            default:
				UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
				break;
          }
        } else {
            UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
        }
      } else {
        UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
      }

    }

    public void onBackPressed() {
    // instead of calling UnityPlayerActivity.onBackPressed() we just ignore the back button event
    // super.onBackPressed();
    }


    public void onNewIntent(Intent intent) {
      // get the uri scheme intent data (bylder://arview?id=x)
      //Intent intent = getIntent();

      if (Intent.ACTION_VIEW.equals(intent.getAction())) {

        Uri uri = intent.getData();
        String modelId = uri.getQueryParameter("id");
        if(modelId != "") {
          switch (modelId){
            case "4011097519876":
				UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
				break;
			case "4011097239071":
			    UnityPlayer.UnitySendMessage("Kudan Camera", "tapScene", "");
				break;
            case "4011097679129":
				UnityPlayer.UnitySendMessage("Kudan Camera", "focusScene", "");
				break;
            case "4011097718590":
				UnityPlayer.UnitySendMessage("Kudan Camera", "wastafelScene", "");
				break;
			case "4011097679594":
				UnityPlayer.UnitySendMessage("Kudan Camera", "showerScene", "");
				break;
            default:
				UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
				break;
          }
        } else {
            UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
        }
      } else {
        UnityPlayer.UnitySendMessage("Kudan Camera", "wastafel2Scene", "");
      }
    }

}
