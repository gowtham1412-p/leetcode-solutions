            }
            sum+=num;
        }
        long sum1=(long) (maxv)*(maxv+1)/2;
        long sum2=(long) (minv)*(minv-1)/2;

        long msng=sum1-sum2-sum;

        return new ArrayList<>(List.of((int) msng));
    }
}
