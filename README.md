#TO BUILD
    mvn clean install
    
# To deploy 

    Unzip the included apache karaf distribution. 
    cd into the server directory
    execute bin/karaf to start the server
    once the console has booted execute the following commands
    
    feature:repo-add cxf
    feature:install cxf
    
    Now copy the built assembly-kar-1.0.0.kar file into the deploy directory of the karaf server
    It should install without any effort from you.
    