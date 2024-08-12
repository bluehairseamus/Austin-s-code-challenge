# Austin-s-code-challenge
This is my attempt at creating the best possible simulator for attempting to leave the Graveler soft lock. This was done as a fun coding challenge and holds no real value. The challenge is explained here: https://youtu.be/M8C8dHQE2Ro?si=oR5HOUaDZtkEtK3u

BEFORE RUNNING
Line 21 is n = 16, change 16 to the number of threads you wish to dedicate to the program. I recommend the number of threads your PC has for optimal performance.

Then change 62500000L on line 9 to any number between 1 and 9,223,372,036,854,775,807, DO NOT DELETE THE L. This number is the number of attempts each thread will simulate, the L increases the integer limit allowing for numbers beyond ~2.15 billion.

The defaults are 16 threads and 62,500,000 as I have a 16 thread CPU and 1,000,000,000/16 is 62,500,000

HOW IT WORKS
The program starts n number of other programs equal to the number of threads, each of these programs will then simulate attempts until the specified number of repetitions is complete, and will then spit its result into the terminal. This allows higher utilization of the CPU.

I am just learning how to do multi-threading so I was unable to do single output due to limitations in how Java handles futures that I don't know how to work around
