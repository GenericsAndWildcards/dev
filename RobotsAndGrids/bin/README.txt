-----------------------------------
Steps to run the project in eclipse
-----------------------------------

1) Unzip folder 'RobotsAndGrids'
2) Open eclipse
3) Click on File -> Import -> General -> Existing Projects into Workspace -> Next
4) Select the folder 'RobotsAndGrids' from your computer
5) In order to run the RobotsAndGrids application on your input data, you need to call 
	GridProcessor.processInput function on your input. 
6) Your Input has to be a list of Strings with 1st row representing grid dimensions and
	consecutive rows representing robot information
7) GridProcessor.processInput will return the processed grid. Call grid.getGridOutput to 
	get the output.
8) Please refer RobotsAndGridTest to see how to call GridProcessor