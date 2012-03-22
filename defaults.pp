if (0 == 1) {
  File {
    content => 'true',
  }
} else {
  File {
    content => 'false',
  }
}

file {
  '/tmp/default.pp.test':
    ensure => present;
}
