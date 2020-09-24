pipeline
{
    agent any
    tools{
        maven 'MAVEN_HOME'
        jdk 'JAVA_HOME'
    }
    stages{
        stage('Initialize'){
            steps{
                bat '''
                echo "PATH=${PATH}"
                echo "M2_HOME=${M2_HOME}"
                '''
            }
        }
        stage('checkout and build'){
            steps{
            git credentialsId: '745b7c1e-6573-4372-a72f-31cc102f49c1', url: 'https://github.com/aneeshgopalakrishna/Demo-BDD.git'
            bat '''
            cd FinalDemoOfDocker
            mvn package
            '''
        }
        }
         stage('docker image build'){
            steps{
            bat '''
            cd FinalDemoOfDocker
            docker build -t imagewithjenkins1 .
            
          docker container prune -f
            '''
        }
         }
        
              
        stage('docker  default image running'){
            steps{
            bat '''
            cd FinalDemoOfDocker
          docker run -d -p 4444:4444 --name selenium-hub selenium/hub 
          docker run -d -P --link selenium-hub:hub selenium/node-chrome-debug 
            '''
        }
        }
        stage('docker image running'){
            steps{
            bat '''
           cd FinalDemoOfDocker
         docker run  imagewithjenkins1
            '''
        }
        }
         stage('docker image stop'){
            steps{
            bat '''
           cd FinalDemoOfDocker
         docker stop imageusingjenkins1
         docker stop selenium-hub
            '''
        }
        }
stage('docker stopping all container'){
            steps{
            bat '''
            cd DemoOfFinalDocker
            FOR /f "tokens=*" %%i IN ('docker ps -q') DO docker stop %%i
         
            '''
        }
        }
        
        
    }  
    
}
