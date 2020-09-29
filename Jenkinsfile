pipeline {
    agent {
        label 'docker-slave'
    }
    tools {
        maven 'apache-maven-3.0.1' 
    }
    stages {
        stage('Build'){
           
                steps{
                     
                dir('FinalDemoOfDocker'){
                 sh  "mvn package"
                
                }
            }
        }
    }
}

                
          
            
    

