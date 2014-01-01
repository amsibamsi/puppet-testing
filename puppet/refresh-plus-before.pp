exec {
  'a':
    command     => '/bin/echo a',
    refreshonly => true,
    before      => Exec['b'],
    notify      => Exec['b'];
  'b':
    command   => '/bin/echo b';
}

file {
  '/tmp/trigger':
    ensure => present,
    notify => Exec['a'];
}
