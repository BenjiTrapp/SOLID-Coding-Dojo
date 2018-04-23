# Solution:

Consider the Board class in the "good" example. The only thing it is responsible for is knowing the values of its 
spots. It is entirely unconcerned with how those spots are being manipulated per the rules of Tic Tac Toe 
(rows, columns, diagonals) or displayed to the user (in a console, on the web, etc.). The BoardShaper and 
BoardPresenter classes are similarly focused on specific tasks. They are also only passed attributes they need; 
for example, BoardShaper objects are initialized with only a size (they don't need the whole board).