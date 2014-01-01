class a {
  exec {
    'a':
      command     => '/bin/echo a',
      refreshonly => true;
    'b':
      command     => '/bin/echo b',
      refreshonly => true;
    'c':
      command => '/bin/echo c';
  }
}

class b inherits a {
  Exec['c'] {
    notify => Exec['a'],
  }
}

class c inherits a {  
  Exec['c'] {
    notify => Exec['b'],
  }
}

include b,c
