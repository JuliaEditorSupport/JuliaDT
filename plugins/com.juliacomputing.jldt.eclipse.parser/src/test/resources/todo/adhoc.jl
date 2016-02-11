monthwrap(m1,m2) = (v = mod1(m1+m2,12); return v < 0 ? 12 + v : v)

if m < d
    delta = d - m
    if f-1 < n-l
        _deleteat_beg!(a, f, delta)
    else
        _deleteat_end!(a, l-delta+1, delta)
    end
elseif m > d
    delta = m - d
    if f-1 < n-l
        _growat_beg!(a, f, delta)
    else
        _growat_end!(a, l+1, delta)
    end
end


@eval begin
    ($fname)(T::Type, dims...)       = fill!(Array(T, dims...), ($felt)(T))
    ($fname)(dims...)                = fill!(Array(Float64, dims...), ($felt)(Float64))
    ($fname){T}(A::AbstractArray{T}) = fill!(similar(A), ($felt)(T))
end


is(I,A) && (I = X::typeof(I))
c < 0 ? -1 : c > 0 ? +1 : cmp(length(a),length(b))


if !in(v_elem, seen)
    push!(ret, v_elem)
    push!(seen, v_elem)
end

for j = offsetj+(1:n)
    for i = offseti+(1:m)
        B[j,i] = ctranspose(A[i,j])
    end
end

for f in (:-, :~, :conj, :sign)
    @eval begin
        function ($f)(A::StridedArray)
            F = similar(A)
            for i in eachindex(A)
                F[i] = ($f)(A[i])
            end
            return F
        end
    end
end

(-)(A::StridedArray{Bool}) = reshape([ -A[i] for i in eachindex(A) ], size(A))

function !(A::StridedArray{Bool})
    F = similar(A)
    for i in eachindex(A)
        F[i] = !A[i]
    end
    return F
end
.^(X::AbstractArray, y::Number      ) =
    reshape([ x ^ y for x in X ], size(X))