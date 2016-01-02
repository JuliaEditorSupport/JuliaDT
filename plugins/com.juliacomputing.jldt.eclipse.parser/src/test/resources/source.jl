#sequence
y = fld(100b+h,36525); c = b + z - 365y - fld(y,4); m = div(5c+456,153);1


monthwrap(m1,m2) = (v = mod1(m1+m2,12); return v < 0 ? 12 + v : v)


#macros
@vectorize_1arg TimeType firstdayofweek
@vectorize_1arg TimeType lastdayofweek

firstdayofmonth(dt::Date) = Date(UTD(value(dt)-day(dt)+1))
firstdayofmonth(dt::DateTime) = DateTime(firstdayofmonth(Date(dt)))

#---
function week(days)
    w = div(abs(days-1),7) % 20871
    c,w = divrem((w + (w >= 10435)),5218)
    w = (w*28+[15,23,3,11][c+1]) % 1461
    return div(w,28) + 1
end


#---

function generateshortestdigits!(num,den,minus,plus,is_even,buffer)
    minus == plus && (plus = minus)
    len = 1
    while true
        digit = Bignums.dividemodulointbignum!(num,den)
        buffer[len] = 0x30 + (digit % UInt8)
        len += 1
        in_delta_room_minus = is_even ?
            Bignums.lessequal(num,minus) : Bignums.less(num,minus)
        in_delta_room_plus = is_even ?
            Bignums.pluscompare(num,plus,den) >= 0: Bignums.pluscompare(num,plus,den) > 0
        if !in_delta_room_minus && !in_delta_room_plus
            Bignums.times10!(num)
            Bignums.times10!(minus)
            minus != plus && Bignums.times10!(plus)
        elseif in_delta_room_minus && in_delta_room_plus
            compare = Bignums.pluscompare(num,num,den)
            if compare < 0
            elseif compare > 0
                buffer[len - 1] += 1
            else
                if (buffer[len - 1] - 0x30) % 2 == 0
                else
                    buffer[len - 1] += 1
                end
            end
            return len
        elseif in_delta_room_minus
            return len
        else
            buffer[len - 1] += 1
            return len
        end
    end
end


#---
function CholeskyPivoted{T}(A::AbstractMatrix{T}, uplo::Char, piv::Vector{BlasInt},
                            rank::BlasInt, tol::Real, info::BlasInt)
    CholeskyPivoted{T,typeof(A)}(A, uplo, piv, rank, tol, info)
end

#---
function __bootexpand(str, obj)
    global docs = List((ccall(:jl_get_current_module, Any, ()), str, obj), docs)
    (isa(obj, Expr) && obj.head === :call) && return nothing
    (isa(obj, Expr) && obj.head === :module) && return esc(Expr(:toplevel, obj))
    esc(obj)
end

#---

eigvals(D::Diagonal) = [eigvals(x) for x in D.diag] #For block matrices, etc.
