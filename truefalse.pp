$a = true
$b = false

if $a {
  notice('a: true')
}

# 'not' not working
#
#if not $b {
#notice ('b: false')
#}

if $a == true {
  notice('a == true')
}

if $b == false {
  notice('b == false')
}
