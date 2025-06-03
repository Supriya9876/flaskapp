def call() {
        sh '''
            kubectl apply -f dep.yaml
            kubectl apply -f service.yaml
        '''
}

