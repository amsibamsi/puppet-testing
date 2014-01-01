define print($message = '') {
  notice("$name: $message")
}

print { '1': message        => '1' }
print { ['2', '3']: message => $name }
