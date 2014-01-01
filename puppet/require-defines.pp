define a {
  notice('a')
}

define b {
  notice('b')
}

a {
  '1':
    require => B['1'];
}
