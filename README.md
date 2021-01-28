# ticktacktoe
Ticktacktoe game using Java with an AI. Can be played versus a CPU or player versus player.
When playing against the CPU the CPU always goes first. The CPU never loses since it plays first and can only be tied.

The CPU's strategy is to always play the upper corner. The end goal in ticktacktoe is to create an unwinnable move where whatever the opponent does 
you will win in the next move. To do this the player must have control of at least two corners.

Examples of this scenario happening are 

X _ X
_ X _
_ _ _

X _ X
_ _ _
X _ _

X _ X
_ _ _
_ _ X


Therefore the first move the CPU will make is in the upper left corner (the corner that you pick doesn't matter this is for simplicity).

There are three general options to approach to respond to the first move:

1. Move in an edge

The response to this would be to create a scenario with option 2 of winning. To do this place the next one in the center as if the opponent doesn't block the CPU will win. After the player blocks by placing one in the bottom right corner place pick the corner where there is nothing inbetween the first corner. 


2. Pick the center (This is the only option that ties)


3. Pick another corner

After picking another corner the best option is to create a scenario with option 2 for winning. The idea is to pick the center to simultaniously create a threat 
as well as setup for positi
