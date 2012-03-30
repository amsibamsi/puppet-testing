class a { 
  if defined("b") {
    notice("b is defined")
  }
  if defined("c") {
    notice("c is defined")
  }
}

class b {}
class c {}

include a,b
