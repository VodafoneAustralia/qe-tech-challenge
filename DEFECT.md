# **SEVERITY 1 BUGS**

## **Bug #1: User is unable to play all the battlefields**
**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select the "Are you game?" battlefield
4. Complete the game
5. Select the "Take the bus" battlefield
6. Complete the game
7. Select the "Go to a public place" OR "Go to the office" battlefield

**Actual Result:**

When navigating to the "Go to a public place" OR "Go to the office" battlefield, the User is unable to play it as they are forced into the same success page as "Take the bus".

This also occurs if "Go to a public place" OR "Go to the office" is played first, and the User tries to navigate to another battlefield that has not been played before.

**Expected Result:**

The User is able to play all 4 battlefields, once each.

**Additional Information:**

N/A

# **SEVERITY 2 BUGS**

## **Bug #2: Duplicate warrior names are allowed**
**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Close all windows with the game
4. Navigate to the home page and enter the exact same warrior name again

**Actual Result:**

Duplicate warrior names are allowed.

**Expected Result:**

Duplicate warrior names should not be allowed.

**Additional Information:**

N/A

## **Bug #3: Scores are being overridden when duplicate warrior names are used**
**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name [Warrior A] and click on "Start your journey"
3. Play any battlefield (ensure you record how many points you have earned)
4. Close all windows with the game
5. Navigate to the home page and enter the exact same warrior name again [Warrior B]
6. Play another battlefield and check your score

**Actual Result:**

Warrior B's score overwrites Warrior A's score, even though they have the same name (and therefore should theoretically be the same person)

**Expected Result:**

Scores should be added and not overridden.

**Additional Information:**

N/A

## **Bug #4: The User is navigated back to the home page when clicking 'Try Again'**
(Found in the "Are you game?" battlefield.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select the "Are you game?" battlefield
4. Click on "Start"
5. Click on the option "If you get better after a couple of days you should be fine"
6. The "Oh no!" negative pop-up message should appear. Click on "Try again"

**Actual Result:**

The User is navigated back to the home page. They need to re-enter the same warrior name again and re-select the same battlefield to continue playing.

**Expected Result:**

Clicking on "Try again" should navigate the User back to the previous page, where they are able to immediately continue the game.

**Additional Information:**

If the User immediately re-enters the same warrior name and navigate to the same battlefield, the previous submissions are still saved and the User is able to continue.

## **Bug #5: Clicking the close button on a negative pop-up message deactivates the progress bar**
(Found only in the "Are you game?" battlefield.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select the "Are you game?" battlefield
4. Click on "Start"
5. Click on the option "If you get better after a couple of days you should be fine"
6. The "Oh no!" negative pop-up message should appear. Click on the close button (x)

**Actual Result:**

The User is navigated back to the previous question page and the progress bar seems deactivated, or no longer has any effect.

**Expected Result:**

The progress bar should continue where it had left off. The time-out negative pop-up message should appear when the progress bar reaches the limit.

**Additional Information:**

This bug occurs throughout the "Are you game?" battlefield with the "Oh no!" negative pop-up message.

# **SEVERITY 3 BUGS**

## **Bug #6: Progress bar in "Are you game?" is being activated before starting the game**
(Found in the "Are you game?" battlefield.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select the "Are you game?" battlefield

**Actual Result:**

The grey progress bar is automatically activated as soon as the User is navigated to the screen. The User may receive the time-out negative pop-up even before clicking "Start".

**Expected Result:**

Grey progress bar should only be activated once the User has clicked "Start".

**Additional Information:**

N/A

## **Bug #7: Progress bar is still active and loading after landing on the success page**
(Found in all battlefields.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select any battlefield
4. Answer all questions correctly
5. Verify the success page

**Actual Result:**

On the "Are you game?" battlefield: the progress bar continues to load until time-out, and the "Oh no!" negative pop-up message is displayed.

On the "Take the bus", "Go to a public place" and "Go to the office" battlefields: the progress bar continues to load until time-out, and the "Time's Up!" negative pop-up message is displayed.

**Expected Result:**

The progress bar should be deactivated on the success page, as there are no further questions to verify.

**Additional Information:**

N/A

## **Bug #8: Empty text button opens the negative pop-up message on a success page**
(Found in the "Take the bus", "Go to a public place" and "Go to the office" battlefields.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select "Take the bus" OR "Go to a public place" OR "Go to the office" battlefield
4. Answer all questions correctly
5. Check the option under "Check your score" on the success page

**Actual Result:**

When the empty text button is clicked, it displays the "That doesn't sound right!" negative pop-up message.

**Expected Result:**

The empty text button should not be displayed as it is unnecessary on the success page.

**Additional Information:**

N/A

## **Bug #9: Image container is changing its dimensions when sliding to a new picture**
(Found on the home page.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)

**Actual Result:**

When the images are sliding to a new picture, the image container changes its dimensions (becomes smaller than bigger in size), which shifts the whole webpage and causes a momentary 'glitch'.

**Expected Result:**

Images should retain their dimensions even when sliding to a new picture. Webpage does not shift and no 'glitch' is involved.

**Additional Information:**

N/A

## **Bug #10: Negative pop-up message is briefly displayed when navigating to the Leaderboard page**
(Found in the "Take the bus", "Go to a public place" and "Go to the office" battlefields.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select "Take the bus" OR "Go to a public place" OR "Go to the office" battlefield
4. Answer all questions correctly
5. Click on "Check your score"

**Actual Result:**

The negative pop-up message "That doesn't sound right!" is briefly displayed before User is navigated to the Leaderboard.

**Expected Result:**

No pop-up messages should be seen. Navigation to the Leaderboard page should be smooth.

**Additional Information:**

N/A

## **Bug #11: SafeWork link on positive pop-up message directs Users to an "access denied" website**
(Found in all battlefields.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select any battlefield
4. Answer a question correctly
5. Verify the positive pop-up message

**Actual Result:**

The positive pop-up message contains a link that navigates to an "access denied" website (<https://www.safeworkaustralia.gov.au/covid-19-information-workplaces/working-home>)

**Expected Result:**

Website should be accessible to all Users - the link may be incorrect or needs to be updated.

**Additional Information:**

N/A

## **Bug #12: Progress bar continues to load when the negative pop-up message is shown**
(Found in the "Take a bus", "Go to a public place" and "Go in the office" battlefields.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select the "Take a bus" OR "Go to a public place" OR "Go in the office" battlefield
4. Answer a question incorrectly to induce the negative pop-up message

**Actual Result:**

The progress bar continues to load even though the negative "That doesn't sound right!" pop-up message is displayed.

**Expected Result:**

Progress bar should be paused when the negative pop-up message is displayed.

**Additional Information:**

N/A

# **SEVERITY 4 BUGS**

## **Bug #13: Spelling errors on the home page**
**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Check for any spelling and grammatical errors

**Actual & Expected Result:**

In the top textbox:

Issue 1: change "super villain" to "SuperVillain"

Issue 2: change "COVID19" to "COVID-19"

Issue 3: change "super heroes" to "SuperHeroes"

Issue 4: at the end of the page -- change "you" to "You"

Issue 5: "Tell me your warrior name" textbox id = "#worrior_username" -- change to "#warrior_username"

**Additional Information:**

N/A

## **Bug #14: Spelling error on the main page**
**Steps to Reproduce:**
1. Navigate to the main page (<https://responsivefight.herokuapp.com/covid>)
2. Check for any spelling errors

**Actual & Expected Result:**

Change "battle field" to "battlefield"

**Additional Information:**

N/A

## **Bug #15: Spelling and other errors in the 'Are you game?' battlefield**
(Found in the "Are you game?" battlefield.)

**Steps to Reproduce:**
1. Navigate to the "Are you game?" battlefield (<https://responsivefight.herokuapp.com/news>)
2. Check for any spelling and grammatical errors

**Actual & Expected Result:**

- In the first "You are in a battlefield..." pop-up message:

Issue 1: change "covid19" to "COVID-19"

Issue 2: change "Hospital" to "hospital"

Issue 3: change "worst" to "worse"

- In the game title:

Issue 4: change "You have enter a world where covid is alive..." to "You have entered a world where COVID-19 is alive..."

Issue 5: change "superhero" and "super hero" to "SuperHero" on every screen that it is mentioned in this game

- In the "Oh no!" negative pop-up message:

Issue 6: change "covid19" to "COVID-19"

- In the "That is correct!" positive pop-up message:

Issue 7: change "Eliminate the risk of exposure to the COVID-19 virus by keeping a safe distance, and work if possible" to "Eliminate the risk of exposure to the COVID-19 virus by keeping a safe distance, and work from home if possible."

- In the second option for the question "You notice a large group of people waiting in line..."

Issue 8: change "move" to "Move"

- In the second option for the question "You must travel to buy food and medical supplies?":

Issue 9: change "sit" to "seat"

- In the first option for the question "You notice the people at the bar are re-using shot glasses..."

Issue 10: change "Fun" to "fun"

- On the success page:

Issue 11: change "covid19" to "COVID-19"

**Additional Information:**

N/A

## **Bug #16: Continue button is slightly off-centre**
(Found in the "Are you game?" battlefield.)

**Steps to Reproduce:**
1. Navigate to the "Are you game? battlefield (<https://responsivefight.herokuapp.com/news>)
2. Answer a question correctly
3. Verify the pop-up message

**Actual Result:**

Continue button is slightly off-centred to the right.

**Expected Result:**

Continue button could be centred to the pop-up message box.

**Additional Information:**

N/A

## **Bug #17: Spelling and other errors on some battlefields**
(Found in the "Take the bus", "Go to a public place" and "Go to the office" battlefields.)

**Steps to Reproduce:**
1. Navigate to the "Take the bus" OR "Go to a public place" OR "Go to the office" battlefield
2. Check for any spelling and grammatical errors

**Actual & Expected Result:**

- In the "You have taken the public bus.." pop-up message:

Issue 1: change "avoid" to "avoided"

Issue 2: choose either "using" or "opting for" -- both together do not make sense

- In the "That doesn't sound right" negative pop-up message:

Issue 3: change "posible" to "possible"

**Additional Information:**

N/A

## **Bug #18: Spelling errors on the Leaderboard page**
(Found on the Leaderboard page.)

**Steps to Reproduce:**
1. Navigate to the Leaderboard page (<https://responsivefight.herokuapp.com/Leaderboard>
2. Check for any spelling errors

**Actual & Expected Result:**

Issue 1: change "user_id" to "User ID"

Issue 2: change "username" to "Username"

Issue 3: change "score" to "Score"

**Additional Information:**

N/A

## **Bug #19: Progress bar loading colours are inconsistent**
(Found in the "Are you game?" battlefield.)

**Steps to Reproduce:**
1. Navigate to the home page (<https://responsivefight.herokuapp.com/>)
2. Enter a warrior name and click on "Start your journey"
3. Select the "Are you game?" battlefield
4. Click on "Start"
5. Allow the progress bar to reach its limit - the negative pop-up message should be displayed
6. Close the pop-up message
7. Answer the question correctly
8. Navigate to the next question
9. Verify the progress bar

**Actual Result:**

The progress bar goes from red, to yellow, then red again (from least amount of time spent to most amount of time spent).

**Expected Result:**

The progress bar should always start as grey, then yellow, then red (from least amount of time spent to most amount of time spent).

**Additional Information:**

N/A