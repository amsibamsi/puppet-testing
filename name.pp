class a {
  notice("class name: $name")
}

define b {
  notice("define name: $name")
}

class c($var = 'val') {
  notice("param class name: $name")
}

include a
b { 'bb': }
class { 'c': }
