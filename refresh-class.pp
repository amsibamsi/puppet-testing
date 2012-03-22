class a {
  exec { '/bin/echo refreshed': refreshonly => true; }
}

define b {
  notice("$name")
}

include a
b {
  '1':
    notify => Class['a'];
}
