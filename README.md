# 305ass2 assignment2

    Sit305 team
    Student ID: 
    • Chengzu Dong (215392074)
    • Yinneng Du (216212265)
Henry comments 13/April   

    "great" isn't a very good commit comment :)
    SIDs still needed in this file.
    The changelog.md file needs to be formatted better. Put a date as a heading for each day you work, then bullet points for each item
    Not enough commits + changelog items to pass at this frequency.
    I couldn't find your text-based data. Create a root folder "data/" and put all your JSON files in there.

Henry comments 17/April

    Changelog needs fixing (I made comments in there).
    data/ should be a directory (as you'll no doubt have many data files, not just one).

# Henry comments 27/April
- Good to see progress. Though your game needs a lot more time spent in it.
- Also your data file doesn't seem to have any readable format? How to you parse this data into classes?



Compile instructions

    The first step is that click my folder and choose build.gradle.
    Then select Android studio as the open method
    After that you have open my project, just simply click green triangle shape that located in the right top corner of the page.
    Then select a virtual machine and click ok button to run the app
    If there is not virtual machine then create one from the phone or tablet. It does not matter, because the game support both of them.     Also, the game support landscape display.
    Then click next button, choose a recommended system image then click next button
    Now click finish then you have done, enjoy to run the game directory explanation

Directory Structure

    After you opened the project, you will see the directory in the project clearly.
    
    The way to find our data and important code has been shown below

    
   For game data
    
    First, click app---->src---->main
    In the main folder, you can click assets, then click data.txt
    Inside of data.txt is our game data.
        You can modify oue game data in the data.txt, and it also will be changed on our game.
    Because this paragraphy is a part of our dialogue in the game. The data will be retrieved from
    data.txt for the dialogue in the game. 


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
    
   For image and distribution
    
    you can find the resources and images that stored on my project from the res folder------>drawable. In drawable folder, you can find     all of the images.
    you can find the all layouts from res folder---->layout folder
    in the res folder------->menu folder, you can find the xml that I made for menu
    in the res folder-------> mipmap folder, you can find where our app icon is
    In the java folder, you will there are many activities.
    For AttackActivity, it is created for the battle processing. we just finished the basic dialog for it now. We will do more soon.
    For AppointmentActivity, which is made for the login process, it can save the use name and data. Even they have closed the game,         they are still able to load their game through their stored username.
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
    For weaponcreatedactivity, after the Prince leo selected the weapon. they can go to next step. And this activity is mainly for           people to choose weapon that they would like to use.
    
    

Data Structure
    
    Wake Up:
    [
    {“id”: “BackgroundText1”, “text”: "        
    Hello, dear player, you will play the role of prince Leo on this game, good luck!
        	Prince Leo wake up in the forest, you had escaped from your country, all of your army dead for protecting you.
        	Now you feel very hungry, you have to choose an option, hunting or waiting for your servant.
        	Remember! You are not prince anymore."
    }
    {“id”: “button”, “character”: “player”, “answers”:
		[
			{“button”: “Hunting”, “GoTo”: “Weapon”}
			{“button”: “Waiting”, “GoTo”: “GameOver”}
		]
    }
    ]


    Weapon:
    [
    {“id”: “Text2”, “text”: Before hunting, you should make a weapon to equip yourself. Now, choose which weapon would you like."}
    {“id”: “button”, “character”: “player”, “answer”:
	[
		{“button”: “Sword”, “GoTo”: “WeaponCreated”}
		{“button”: “Bow”, “GoTo”: “WeaponCreated”}
		{“button”: “Spear”, “GoTo”: “WeaponCreated”}
    ]
    }
    ]


    WeaponCreated:
    [
    {“id”: “Text3”, “text”: “Great! You have made your weapon. Now, go to hunt, enjoy!”}
    	{“id”: “button”, “character”: “player”, “answer”:
		[
			{“button”: “Go East”, “GoTo”: “East”}
			{“button”: “Go West”, “GoTo”: “West”}
			{“button”: “Go South”, “GoTo”: “South”}
			{“button”: “Go North”, “GoTo”: “North”}
		]
        }
    ]
                East
            [
        {“id”: “Text4”, “text”: “You saw your country, you were the prince of this kingdom. What do you want to do now?”}
    {“id”: “button”, “character”: “player”, “answer”:
	[
		{“button”: “GoToRevenge”, “GoTo”: “Revenge”}
		{“button”: “HuntingForSurvive”, “GoTo”: “WeaponCreated”}
                ]
            }
        ]


    West
    [
	   {“id”: “Text5”, “text”: “Great. you successfully hunted, enjoy your chicken dinner!”}
	{“id”: “button”, “character”: “player”, “answer”:
		[
			{“button”: “EnjoyYourChickenDinner”, “GoTo”: “WeaponCreated”}
		]
    }
    ]

    South
    [
	{“id”: “Text6”, “text”: “
    An elder: Oh, my kid, you are crying, what's happened? 
    Prince Leo: I was fishing with my father at here, but my father has been murdered
    Elder: oh, my pity boy, do not cry, be a brave man, be a real man.
    Prince Leo: Thanks, I will revenge for my father soon.”}
	   {“id”: “button”, “character”: “player”, “answer”:
		[
		{“button”: “Revenge”, “GoTo”: “Revenge”}
		{“button”: “HuntingForSurvive”, “GoTo”: “WeaponCreated”}
		]
    }
    ]

    North
    [
	{“id”: “Text7”, “text”: “Nothing but desert"}
	{“id”: “button”, “character”: “player”, “answer”:
		[
			{“button”: “Hunting”, “GoTo”: “WeaponCreated”}
    ]
    }
    ]

