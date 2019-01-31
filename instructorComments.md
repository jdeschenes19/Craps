INSTRUCTOR COMMENTS
===================

This is a nice little program, Jack! It's very efficient, 
very minimal, to the point of being unclear if you don't
know your way around a craps game. For example:

Transcript:
-----------

    Do you want to play craps?
    y
    Do you need instructions?
    n
    Ok, roll your first toss by hitting ENTER!

    You rolled 6 and 4.

    You rolled 5 and 6.

    You rolled 1 and 3.

    You rolled 4 and 4.

So you've asked some yes/no questions but I'm not sure
exactly what I should respond with: "Yes"? "yes"? "Y"?
"y"? Can I just hit [Enter]? 

There was a section in the [assignment](http://www.crashwhite.com/apcompsci/materials/assignments/activities-projects/project-craps.pdf) that talked
about programming for default values, and you *did* implement 
that strategy for the rolling part of the program (although 
there was no visual indication that I could do that). A little
clarity on that interaction, along with some identification of 
the point that we're trying to roll, would improve the game play
for novices.

In terms of the structure of the program itself, I see that you 
implemented it two nested loops, with a variable `result` acting
as a code for the "play again" signifier and another variable
`rollResult` acting as a game status indicator. That's not bad 
and the game works just fine. I'm wondering if it wouldn't be
possible to clean up the structure a little so the logic of 
the game is more evident? If someone were picking through your
code in an effort to understand the game, it would be more
challenging (as written) than some other strategies.

If you had another day to refactor, I wonder what kind of changes
you might make!

Overall, however, very nice work. Keep it up!

SCORE: 48/50

