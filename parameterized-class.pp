class a(
  $var = 'default',
  $var2 = 'default'
) {
  notice("vars: $var, $var2")
}

class { 'a': var2 => 'non-default' }
