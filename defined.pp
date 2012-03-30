class c { 
  if defined("b") {
    notice("is defined")
  }
}

include a

class a { 
  include b
  include c
}

class b { 
}
