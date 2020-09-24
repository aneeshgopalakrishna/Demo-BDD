pipeline {
    agent any
        
    
    stages {
       
         
        stage('Build') { 
            steps {
                 sh '''
            cd FinalDemoOfDocker
            mvn package
            '''
            }
        }
    }
}
