#To Build
    mvn clean install
    
# To deploy 

     Download DDF 2.8.2 
    
    cd into the server directory
    execute bin/ddf to start the server
    once the console has booted execute the following commands
    
    navigate to https:localhost:8993/admin
    Install the full developer version
    
    
    Now copy the built assembly-kar-1.0.0.kar file into the deploy directory of the ddf server
    It should install without any effort from you.
    Go to https://localhost:8993/services   then click on the one for the blue endpoint to see the WADL
    