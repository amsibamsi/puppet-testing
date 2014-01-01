require 'augeas'

Augeas::open do |aug|
  path = '/files/etc/hosts/*[ipaddr = "127.0.0.2"]'
  if aug.exists(path)
    value = aug.get("#{path}/canonical")
    puts "value: #{value}"
  else
    puts "does not exist"
  end
end
