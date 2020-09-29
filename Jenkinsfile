pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
       
         
        stage('Build') { 
           
            steps {
                 sh '''
                 cd FinalDemoOfDocker
            mvn --v
            
            '''
            }
        }
    }
}
