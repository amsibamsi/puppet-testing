class a(
  $par = 'default'
) {
  notify { $par: }
}

class b {
  class {
    'a':
      par => 'nondefault';
  }
}

class c {
  include a
}

include b
include c
