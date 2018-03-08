-----------------------------------
Steps to run the project in eclipse
-----------------------------------

1) Clone the git repo using command 'git clone https://github.com/asmitachitale/dev.git'
2) Open eclipse
3) Click on File -> Import -> General -> Existing Projects into Workspace -> Next
4) Browse to the folder where cloned this git repo, go in 'dev' folder and select folder 'RobotsAndGrids' for import
5) In order to run the RobotsAndGrids application on your input data, you need to call GridProcessor.processInput function on your input. 
6) Your Input has to be a list of Strings with 1st row representing grid dimensions and consecutive rows representing robot information
7) GridProcessor.processInput will return the processed grid. Call grid.getGridOutput to get the output.
8) Please refer RobotsAndGridTest to see how to call GridProcessor
