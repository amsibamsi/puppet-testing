exec {
  'check-file':
    command => '/bin/bash -c "if [ ! -f /nirvana ]; then \"echo must create file manually: /nirvana\"; exit 1; fi"';
}
