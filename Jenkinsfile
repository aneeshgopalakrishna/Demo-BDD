pipeline {
    agent {
         docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
   
    stages {
        stage('Build'){
           
                steps{
                    withMaven(maven: 'mvn'){
                dir('FinalDemoOfDocker'){
                 sh  "mvn package"
                }
                }
            }
        }
    }
}

                
          
            
    

