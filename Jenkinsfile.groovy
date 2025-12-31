pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Bala5667/mediplus-lite-new.git'
            }
        }
    }
}
