require 'matrix'

class Vector

  def dotProduct(vector)
    sum = 0
    (0..self.size-1).each {
      |e|
      sum += self[e]*vector[e]
    }
    return sum
  end

end
