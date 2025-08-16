import speech_recognition as sr
import pyttsx3
import webbrowser
import os

engine = pyttsx3.init()
engine.say("Hello, I am APS. How can I help you?")
engine.runAndWait()

def speak(text):
    engine.say(text)
    engine.runAndWait()

def listen():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        audio = r.listen(source)
        try:
            command = r.recognize_google(audio, language="en-in")  # Indian English
            print("You said:", command)
            return command.lower()
        except:
            speak("Sorry, I did not understand.")
            return ""

while True:
    command = listen()

    if "youtube" in command:
        speak("Opening YouTube")
        webbrowser.open("https://www.youtube.com")

    elif "chrome" in command:
        speak("Opening Chrome")
        os.startfile("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")

    elif "stop" in command or "exit" in command:
        speak("Goodbye Atharv, shutting down.")
        break

    else:
        speak("Sorry, I don't know this command yet.")
