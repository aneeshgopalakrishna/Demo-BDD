pipeline {
    agent {
        label: docker-slave
        }
    }
   
    stages {
        stage('Build'){
           
                steps{
                    
                dir('FinalDemoOfDocker'){
                 script  "mvn package"
                
                
            }
        }
    }
}

                
          
            
    

