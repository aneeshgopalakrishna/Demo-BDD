pipeline {
    agent any 
    options {
        skipStagesAfterUnstable()
    }
        
    
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
