305ass2

assignment2
Henry comments 13/April

    "great" isn't a very good commit comment :)
    SIDs still needed in this file.
    The changelog.md file needs to be formatted better. Put a date as a heading for each day you work, then bullet points for each item
    Not enough commits + changelog items to pass at this frequency.
    I couldn't find your text-based data. Create a root folder "data/" and put all your JSON files in there.

Henry comments 17/April

    Changelog needs fixing (I made comments in there).
    data/ should be a directory (as you'll no doubt have many data files, not just one).

Compile instructions

    The first step is that click my folder and choose build.gradle.
    Then select Android studio as the open method
    After that you have open my project, just simply click green triangle shape that located in the right top corner of the page.
    Then select a virtual machine and click ok button to run the app
    If there is not virtual machine then create one from the phone or tablet. It does not matter, because the game support both of them. Also, the game support landscape display.
    Then click next button, choose a recommended system image then click next button
    Now click finish then you have done, enjoy to run the game directory explanation

Directory Structure

    After you opened the project, you will see the directory in the project clearly.
    
    The way to find our data and important code

    
   For game data
    
    First, click app---->src---->main
    In the main folder, you can click assets, then click data.txt
    Inside of data.txt is our game data.
        You can modify oue game data in the data.txt, and it also will be changed on our game.
    Because this paragraphy is a part of our dialogue in the game.


   For improtant code
    
    First, click app---->src---->main
    In the main folder, you can click jajva/com/example/chengzu/sit305assignment2, then you can find the important code that
    is made for activities.
    Then go back to main folder, click res
    Then you can click drawable, you will see our image resource from there.
    Then go back to res, cick layout, you can see our layout resource file.
    Then go back to res,click menu,from there. you can see our menu.
    Then go back to res,in the mipmap, where stored our app icon.
    Then go back to res,click values. where storeed our colors,strings and styles.
    
    you can find the resources and images that stored on my project from the res folder------>drawable. In drawable folder, you can find all of the images.
    you can find the all layouts from res folder---->layout folder
    in the res folder------->menu folder, you can find the xml that I made for menu
    in the res folder-------> mipmap folder, you can find where our app icon is
    In the java folder, you will there are many activities.
    For AttackActivity, it is created for the battle processing. we just finished the basic dialog for it now. We will do more soon.
    For AppointmentActivity, which is made for the login process, it can save the use name and data. Even they have closed the game, they are still able to load their game through their stored username.
    For DatabaseHelper, it is made for helping data store and load and modify. It is based on the SQL query.
    For eastActivity,it will show the navigation to east and what player will see if they go east.
    For westActivity,it will show the navigation to east and what player will see if they go east.
    For southActivity,it will show the navigation to east and what player will see if they go east.
    For northActivity,it will show the navigation to east and what player will see if they go east.
    For EditDataActivity, user can add a new user or change their own username.
    For gameoverActivity, if user clicked something wrong they will fail these game. Then they will see the GID of game over.
    For ListDataActivity, it will list the user record there.
    For main2Setting, user can open or pause music there
    For Mainactivity, it is the homescreen that user can go to anywhere in the game\
    For RevengeActivity, it is made for Prince leo to go to revenge and recruit his helpers.
    For Splashscreen activity, it will show the splash screen for second when user open the game
    For wakeup activity, it will show the first activity that prince leo waked up from teh forest after he escaped from Kingdom
    For Weaponactivity, there are multiple choices for user to choose their favourite weapon.
    For weaponcreatedactivity, after the Prince leo selected the weapon. they can go to next step. And this activity is mainly for people to choose weapon that they would like to use.
