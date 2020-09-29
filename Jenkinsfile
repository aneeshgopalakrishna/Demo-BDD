pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
        stage('Build'){
           
                steps{
                     withMaven(maven:'mvn'){
                dir('FinalDemoOfDocker'){
                 sh  "mvn package"
                }
                }
            }
        }
    }
}

                
          
            
    

