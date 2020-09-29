pipeline {
   
    stages {
       
         
        stage('Build') { 
            agent { label 'trial' }
            steps {
                 sh '''
            cd FinalDemoOfDocker
            mvn package
            '''
            }
        }
    }
}
