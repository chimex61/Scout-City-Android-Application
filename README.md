# Scout City:Android Application

## Outline

This is a location based android application which provides the users with latest and up to date information about different cafes, restaurants, food joints and recommended places such as city attractions and theme park throughout the city around the world. The user can select any of the default cities provided while launching the application or use GPS to set the current location of the user. The app provides the user with GPS based navigation and Maps to the user, along with the entire location information like rating, website, contact info and location tips provided by others.

## Features and Functionalities

* Splash screen is provided which is shown when the application is launced.
* Login implementation is done with the help of firebase.
* Additionally google sign in feature is added to the application.
* User can select from list of predefined location in US to find the nearby restaurents, places, food joints, parks, cafes and recommended places.
* OR user can select his current location to find the places nearby.
* Recycler view in combination with view pager is implemented to show the places.
* When the place is selected its location is displayed in Maps. By clicking the marker of the location options for navigation is provided.
* Share functionality is inclusive to each place for a location, where a user can send the details to any one through mail, bluetooth, whats app and so on.
* A pop up activity is present in the main screen wher the use canselect any location. (Note: The feature is partially implemented)
* A user can search any place if he know the name of the restaurant or place to search.

## Steps to run the application

* Copy the Scout City application folder to local drive.
* Open the application with Android Studio and run the application.
* Preferably use Genymotion emulator or an actual android device connected to the PC in debugging mode to avoid unexpected errors that which are usually caused through GPS options selected in emulator.

## API and Libraries used

* FourSquare API for retriving the places details.
* Maps API for showing the place location on Map based on the latitude and longitude received from FourSquare API
* Retrofit library for fetching data from FourSquare server.
* Picasso Library for loading images from url.
* Firebase for login, authentication and storage.

## Sample Screen Shots
![splashscreen](https://user-images.githubusercontent.com/22403046/35500469-8fa1f03c-04a4-11e8-997d-7edf20fd162e.jpg) ![login screen](https://user-images.githubusercontent.com/22403046/35500539-c7e91cd6-04a4-11e8-96ee-b2124fe3c927.jpg)

![pop up activity](https://user-images.githubusercontent.com/22403046/35501058-b9d81866-04a6-11e8-945a-57fbf9b48a58.png) ![profile screen](https://user-images.githubusercontent.com/22403046/35501155-1dd68136-04a7-11e8-8dd2-10842e6f67df.png)

![navigation drawer](https://user-images.githubusercontent.com/22403046/35500600-fe75a576-04a4-11e8-8d72-4b5f16c8c1b4.jpg) ![main screen](https://user-images.githubusercontent.com/22403046/35500586-ef977c46-04a4-11e8-9858-c4e9dda3f6c0.jpg)


![recycler view](https://user-images.githubusercontent.com/22403046/35500653-34de97d0-04a5-11e8-816b-474eb2c896c3.png) ![gps screen](https://user-images.githubusercontent.com/22403046/35501044-af07283c-04a6-11e8-930c-b4b9d0aa55b3.png) 

 



## Note

In-depth explanation for each feature and implementaiton is explained in the document attached to the repository. 

