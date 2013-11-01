define test_boolean(
  $bool
) {
  if ($bool) {
    notice("true: $bool")
  } elsif (!$bool) {
    notice("false: $bool")
  } else {
    alert("$bool is whether true nor false")
  }
}

test_boolean {
  'true':
    bool => true;
  'false':
    bool => false;
  'string':
    bool => 'abc';
  'empty':
    bool => '';
}
