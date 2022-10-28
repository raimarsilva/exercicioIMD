FROM node:16.17.0
COPY . .
WORKDIR /src/
EXPOSE 3000
RUN npm ci --production
CMD ["npm", "start"]