package com.simplilearnproject.VirtualKey.Services;

import com.simplilearnproject.VirtualKey.Screen.FileOptionsScreen;
import com.simplilearnproject.VirtualKey.Screen.Screen;
import com.simplilearnproject.VirtualKey.Screen.WelcomeScreen;
public class ScreenService {
    public static com.simplilearnproject.VirtualKey.Screen.WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    public static Screen CurrentScreen = WelcomeScreen;
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }
    public static void setCurrentScreen(FileOptionsScreen currentScreen) {
        CurrentScreen = currentScreen;
    }
}
