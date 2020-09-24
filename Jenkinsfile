pipeline {
    agent {
    docker {
        image 'maven:3-alpine'
        label 'local'
        args  '-v /tmp:/tmp'
    }
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
