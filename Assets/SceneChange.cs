using UnityEngine;
using UnityEngine.SceneManagement;
using System.Collections;

public class SceneChange : MonoBehaviour 
{

    public void showerScene()
    {
        SceneManager.LoadScene("Showerpipe");
    }

    public void tapScene()
    {
        SceneManager.LoadScene("Animation_Tap");
    }

    public void wastafelScene()
    {
        SceneManager.LoadScene("Wastafel");
    }

    public void wastafel2Scene()
    {
        SceneManager.LoadScene("Wastafel2");
    }

    public void focusScene()
    {
        SceneManager.LoadScene("Focus_Elec");
    }

}